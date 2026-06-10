/**
 * 
 */
/**
 * 스프링 관련 정보
 */
module SpringModules {
	// 이 모듈을 참조할 JavaFxUI가 스프링 컨텍스트 컴포넌트들을 함께 인지하도록 전파(transitive)합니다.
	requires transitive spring.core;
	requires transitive spring.context;
	requires transitive spring.beans;
	requires spring.aop;

	exports com.github.hyunwoo52014.project.service;

	// 스프링 핵심 컨테이너 및 AOP 프록시 엔진이 내부 자원을 스캔할 수 있도록 전적으로 개방합니다.
	opens com.github.hyunwoo52014.project.service to spring.core, spring.beans, spring.context, spring.aop;
}