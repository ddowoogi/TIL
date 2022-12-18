# requestparam-pathvariable

컨트롤라에서 Requestparam으로 파라미터 값을 넘겨받을 때 아무 생각 없이 사용하곤 했는데, 이번 기회에

이 어노테이션에 대해 정리해 보고자 한다.

 

스프링에서는 컨트롤러로 사용할 클래스 상단에 @Controller를 지정합니다.

 

주로 사용하는 형태의 파라메터를 전달하는 경우입니다.

Case 1 ) http://xxx.x.x?index=1&page=2

Case 2 ) http://xxxx.x.x/index/1
Case 1의 경우 파라미터의 값과 이름을 함께 전달하는 방식으로 게시판 등에서 페이지 및 검색 정보를 함께 전달하는 방식을 사용할 때 많이 사용합니다.

Case 2의 경우 Rest api에서 값을 호출할 때 주로 많이 사용합니다.

 

Spring에서는 이러한 전달인자를 처리하는데 두 가지 방법을 제공합니다.

 

 

Case 1의 경우 @Requestparam을 사용하는데 해당 어노테이션에 대하여 알아봅니다!

 

| @RequestParam이란? 
 

어노테이션의 괄호 안의 경우 전달인자 이름(실제 값을 표시)

 

1.단일 파라미터 변환

@GetMapping("getDriver")
public String viewName( @RequestParam("name") String name, @RequestParam("name2") String name2){

	//위처럼 하나 이상의 타입을 적용할 수 있습니다.
  	//스플잉에서 지원하는 변환기에서 지원되는 모든타입을 변환가능합니다.
	//RequesParam은 하나 이상 파라미터에서 사용 가능합니다.

}
 

ex)  /getDriver?name="name에 담긴 value"
위의 경우 url이 전달될 때 name 파라미터(name에 담긴 value)를 받아오게 됩니다.

즉, @RequestParam("실제 값") String 설정할 변수 이름

이런식으로 표현합니다.

 

이렇게 @RequestParam의 경우 url뒤에 붙는 파라미터의 값을 가져올 때 사용합니다.

 

| 주의  !!
 

만약 RequestParam에 key값이 존재하지 않을 경우

"BadRequest 로 4**" error가 발생합니다.

 

이를 방지하고자 default 값을 설정해줍니다.

바로 "DefaultValue"를 이용하여 기본 값을 설정해줍니다.

(  " required=false " 속성을 꼭 명시해줘야 합니다. )


@GetMapping("getDriver")
public String viewName( @RequestParam("name",required=false,defaultValue="")
			String name, @RequestParam("name2",required="false,defaultValue="") String name2){

		//이런식으로 defaultValue를 지정하려면 required 속성을 명시해줘야 합니다.

}
required = false 속성을 명시함으로써 키값이 존재하지 않다고 해서 BadRequest가 발생하지 않게 됩니다.

그리고 존재하지 않다면 String 변수에 default로 "" 값이 들어가게 됩니다.

 

| 만약파라미터가 많아지게 되면 ?
 

파라미터가 많아지게 된다면 일일이 파라미터를 지정하는게 귀찮아 집니다.

이럴때는 Map으로 간단하게 받아올 수 있습니다.

 

여러개의 Parameter일 경우

@GetMapping("test")
public void testMethod(@RequestParam HashMap<String,String> paramMap){
	
    String data = paramMap.get("testParam");

}
위와 같이 Map을 통하여 파라미터를 컨트롤할 수 있습니다.

대규모의 파라미터를 받는데 map을 사용하면 편하지만 개발한 이외의 사람들이 유지보수 하기에는

어류운 점이 있습니다.

 

그래서 주로 " 커맨드 패턴 " 인 데이터 커맨드를 만들어서 사용합니다.

데이터 커맨드는 다음 글에 다루도록 하겠습니다.

 

| @PathVariable이란?
Type2의 URL을 처리할 때는 @PathVariable을 사용하게 됩니다.

 

@PostMapping("delete/{idx}")
@ResponseBody
public void testMethod(@PathVariable("idx") int id ){
	return testService.deleteId(id);
}
위의 예제처럼 PathVariable 의 경우 url에서 각 구분자에 들어오는 값을 처리해야 할 때 사용합니다.

 

너무나도 중요한 점 !!!
WAS같은 경우 URL에 특수문자나 구분기호 " , , ` , . " 등을 사용하면 인식을 못한다.

따라서 URL에 태우지 말고 JSON 형태로 HTTP BODY에 실어 보내야 한다 .!!

그러므로 여러개의 파라미터값을 삭제할 때 ex)1,2,3,4 이런식으로 url에 요청하면 안된다.

주의하자 !!!!

 

 

 

실제 사용은

2개다 복합적으로 사용합니다.

@GetMapping("test")
public List<Test> testMethod( @PathVariable("idx) int id, @RequestParam(value="date",required="false)
Date userDate) {



}
