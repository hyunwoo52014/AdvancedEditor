package com.github.hyunwoo52014.project.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.github.hyunwoo52014.project.service.AppConfig;
import com.github.hyunwoo52014.project.service.DataService;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AppLauncher extends Application {

	// Main 모듈에서 전달할 껍데기 레이블 생성
	private static final Label uiLabel = new Label("초기화중");
	private AnnotationConfigApplicationContext springContext;
	
	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		this.springContext = new AnnotationConfigApplicationContext(AppConfig.class);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		StackPane root = new StackPane(uiLabel); 
	    Scene scene = new Scene(root, 450, 300);
	    
	    DataService dataService = this.springContext.getBean(DataService.class);
	    String data = dataService.getSpringData();
	    
	    uiLabel.setText(data);
	    
	    primaryStage.setTitle("Spring & JavaFX 멀티 모듈");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		Platform.exit();
		System.exit(0);
	}

}
