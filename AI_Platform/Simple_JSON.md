### JSON 개요
<hr>
JSON(제이슨 , JavaScript Object Notation) 표기법은 인간이 읽을 수 있는 데이터 교환용으로 설계된 경량 텍스트 기반 개방형 표준 포멧이다. JSON 에서 사용되는 규칙은 프로그래머들에게 잘 알려진 C, C++, Java, Python, Perl 등 수많은 프로그래밍 언어에서 쉽게 이용할 수 있다. JSON 은 JavaScript 객체 표기법을 의미한다.


- 이 포맷은 Douglas Crockford 에 의해 구체화되었다.
- 인간이 읽을 수 있는 데이터 교환을 위해 설계되었다.
- JavaScript에서 확장되었다.
- 파일 이름 확장자는 .json 이다.
- JSON 인터넷 미디어 타입은 application/json 이다.

### JSON 사용
<hr>

- 브라우저 확장 프로그램 또는 웹 사이트를 포함하는 JavaScript 기반 응용 프로그램을 작성할 때 사용된다.
- JSON 형식은 네트워크 연결을 통해 구조화 된 데이터를 직렬화 및 전송하는데 사용된다.
- 주로 서버와 Web 응용 프로그램 간에 데이터를 전송 하는데 사용된다.
- Web 서비스와 API.s 는 공개 데이터를 제공하기 위해 JSON 형식을 사용한다.
- 여러 프로그래밍 언어에서 사용할 수 있다.

### JSON 특징
<hr>

- JSON 을 읽고 쓰는 것은 간단하다.
- 가벼운 텍스트 기반 교환 형식이다.
- 언어에 의존하지 않는다.

### JSON 문법
<hr>

- 데이터는 속성-값 쌍으로 표현된다.
- 중괄호는 개체를 유지하고 각각의 이름이 계속되고있는 ':'(콜론), 속성-값 쌍으로 쉼표로 구분된다.
- 대괄호는 배열과 값은 쉼표로 구분 된다.

> JSON 데이터 타입

타입	설명
Number	JavaScript에서 배정되는 정밀한 부동 소수점 형식
String	큰 따옴표를 사용한 유니코드
Boolean	true 또는 false
Array	연속된 값들의 정렬
Value	string, number, true 또는 false, null 등
Object	정렬되지 않은 key:value 콜렉션
Whitespace	토큰쌍 사이에서 사용 가능
null	비었음

> 숫자(Number)

- JavaScript에서 배정되는 정밀한 부동 소수점 형식이다.
- 진수와 16 진수는 사용되지 않는다.
- N부호 또는 무한대는 숫자로 사용되지 않는다.
- 아래의 표는 숫자 타입들이다.

타입	설명
정수	숫자 1-9,0 및 양수 또는 음수
분수	3, .9 같은 분수
지수	e, e+, e-,E, E+, E- 같은 지수
문법
var json-object-name = { string : number_value, .......}
예제
Number 데이터 타입의 값은 따옴표를 사용하지 않아야 한다.

var obj = {marks: 97}

> 문자열(String)

- 큰 따옴표로 묶인 Unicode 문자의 순서입니다.
- 문자는 길이 1의 문자열, 즉 단일 문자열입니다.
- 아래의 표는 문자열의 형식이다.

타입	설명
"	큰 따옴표
\\ 역슬래쉬
\/	슬래쉬
\b	백스페이스
\f	폼 피드(form feed)
\n	새로운 줄
\ r	리턴 키
\t	탭 키
\ u	16진수 4자리

문법

var json-object-name = { string : "string value", .......}
예제

String 데이터 타입의 값은 따옴표를 사용해야 합니다.

var obj = {name: "Amit"}
참/거짓(Boolean)
true 또는 false 값을 가지고 있습니다.
문법
var json-object-name = { string : true/false, .......}
예제
String 데이터 타입의 값은 따옴표를 사용해야 합니다.

var obj = {distinction: true}
> 배열(Array)

- 정렬된 값의 컬렉션이다.
- 대괄호를 둘러싸여 있으며, '[' 로 시작해서 ']' 로 끝난다.
- 값은 쉼표로 구분된다.
- 배열 인덱스는 0 으로 시작한다.
- 키 이름이 연속하는 정수이면 배열을 사용해야 한다.

문법
[ value, .......]
예제
예제는 여러개의 오브젝트를 포함한 배열이다.

{
    "books": [{
        "language": "Java",
        "edition": "second"
    }, {
        "language": "C++",
        "lastName": "fifth"
    }, {
        "language": "C",
        "lastName": "third"
    }]
}
>객체(Object)

- 정렬되지 않은 이름과 값이 쌍(pairs)으로 이루어진 세트입니다.
- 오브젝트는 중괄호로 둘러싸여 있으며, '{' 로 시작해서 '}' 로 끝난다.
- 각각의 이름은 ':'(콜론) 그리고 ','(쉼표) 로 구분된 속성-값 쌍으로 되어 있다.
- 키는 문자열이어야 하며, 서로 달라야 한다.
- 오브젝트들은 키는 문자열이어야 한다.

문법
{ string : value, .......}
예제
예제는 1개의 오브젝트를 나타낸다.

{
    "id": "011A",
    "language": "JAVA",
    "price": 500
}
> Null

- 이것은 비어있는 타입을 의미합니다.