package sample4;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {
		// 1. 스프링 컨테이너 구동
		// => bean.xml에 정의한 bean 객체 설정 정보를 읽어와서 내부적으로
		//	  MessageBean 객체를 생성하고 초기화한다.
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("sample4/bean.xml");
		// 2. bean 객체 얻기 
		MessageBean bean = (MessageBean)context.getBean("bean");
		bean.sayHello();
		// 3. 스프링 컨테이너 종료
		context.close();
	}
}
