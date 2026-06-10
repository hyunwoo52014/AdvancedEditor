# AdvancedEditor
일반적인 텍스트 에디터에 다양한 기능을 부착하여 운용할 수 있는 JavaFx + Spring 애플리케이션

---

## 목차
1. 개발환경
2. 자식 모듈에 대한 간단한 설명과 용도
3. 구현 목록

---

# 1. 개발환경
- OpenJDK 64-Bit Server VM (build 25.0.2+10-69, mixed mode, sharing)
- Eclipse, Version: 2025-12 (4.38.0) / Build id: 20251204-0850
- Maven Wrapper (현재 호출할 maven version은 3.9.11)

# 2. 자식 모듈에 대한 간단한 설명과 용도
- JavaFxUI : JavaFx를 활용한 모듈, 앱을 사용하긴 위한 화면 렌더링, 프론트엔드
- SpringModules : Spring Framework 프로젝트를 통해 앱의 기능을 구현하기 위한 모듈, 백그라운드
- Main : main 메소드, Entry Point가 있는 모듈, POJO를 통한 독립적인 기능 구현도 해당 모듈에 기술
 
# 3. 구현 목록
- 파일 입출력
- 파일 텍스트 편집
- hex 데이터 편집

---