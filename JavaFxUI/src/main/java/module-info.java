module JavaFxUI {
	requires transitive javafx.controls;
	requires transitive javafx.graphics;

	// 스프링 자식 모듈을 가져옵니다. (BOM 전파 덕분에 스프링 컨텍스트도 자동 관통됩니다)
	requires SpringModules;

	exports com.github.hyunwoo52014.project.ui;

	// JavaFX 내부 구동 그래픽스 엔진이 리플렉션으로 AppLauncher를 찾아 생성하도록 문을 열어줍니다.
	opens com.github.hyunwoo52014.project.ui to javafx.graphics;
}