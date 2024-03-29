## 목차
<hr>

- Json-java(org.json) 사용법
- json 파일 읽어서 값 추출하는 실습

## 핵심
<hr>

- org.json API를 사용하면 객체를 바로 만들어 사용할 수 있다.
## org.json(JSON-java) 사용법
<hr>
json을 만드는 다른 API이다. Gson과 다른 점은 객체를 바로 만들어서 사용할 수 있다. JSONObject라는 객체가 json형태로 객체를 생성한다.

   ```json // 1. student json 객체 만들기
    JSONObject student = new JSONObject();
    student.put("name", "son");
    student.put("phone", "010-1111-1111");
    student.put("address", "광주");

    JSONObject student2 = new JSONObject();
    student2.put("name", "jun");
    student2.put("phone", "010-2222-2222");
    student2.put("address", "서울");

    // 2. students json 배열 만들기
    JSONArray students = new JSONArray();
    students.put(student);
    students.put(student2);
 

    // 3. object json 객체 만들기
    JSONObject object = new JSONObject();
    object.put("students", students);
    System.out.println(object.toString(2));
``` 

## json 파일 읽어서 값 추출하는 실습

   ```json // 1. json 파일에서 json 데이터 불러오기
    String src = "info.json";
    InputStream is = Project01_C.class.getResourceAsStream(src);
    if (is == null) {
        throw new NullPointerException("Cannot find resource file");
    }

    // 2. 읽어온 json 데이터를 메모리에 로딩하기  : JSONTokener 객체 사용
    JSONTokener tokener = new JSONTokener(is);

    // 3. JSONTokener 객체를 JSONObject 객체로 만들기
    JSONObject students = new JSONObject(tokener);

    // 4. Json 객체에 있던 jsonArray 꺼내기
    JSONArray studentArr = students.getJSONArray("students");

    // 5. jsonArray 안에 있는 student 객체 출력하기.
    for (int i = 0; i < studentArr.length(); i++) {
        JSONObject student = studentArr.getJSONObject(i);
        System.out.println(student.get("address"));
    } 
```

## Gson과 org.json의 차이

Gson과 org.json의 차이는 객체를 직접 만드느냐의 차이이다. Gson은 내가 만든 객체를 json으로 바꾸고, org.json은 객체를 통해 바로 json객체를 만든다. org.json은 javascript 객체를 바로 java에서 만드는 느낌.


## JsonObject에서 값을 꺼낼 땐 자료형이 Object?

JsonObject의 value 값은 Object 자료형인 것 같다?

```json       // 객체 생성
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name" , "gildong");
        jsonObject.put("address" , "광주");
        // 배열 생성
        JSONArray arr = new JSONArray();
        arr.put(jsonObject);
        for (int i = 0; i < arr.length(); i++) {
            JSONObject obj = arr.getJSONObject(i); // 배열 속 객체
            Object string = obj.get("address"); // 객체 속 "address"의 값을 Object로 upCasting 해야함
            System.out.println(string.toString());
        }
```