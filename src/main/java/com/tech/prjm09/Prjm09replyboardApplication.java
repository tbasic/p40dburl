package com.tech.prjm09;

import java.security.CodeSource;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Prjm09replyboardApplication {
		
	public static void main(String[] args) {
		SpringApplication.run(Prjm09replyboardApplication.class, args);	
	}

//    public static void main(String[] args) {
//        SpringApplication app = new SpringApplication(Prjm09replyboardApplication.class);
//
//        // WAR 파일 경로 기반 프로파일 설정
//        String path = getWarLocation();
//        System.out.println("path : "+path);
//        Map<String, Object> props = new HashMap<>();
//
//        if (path != null && path.contains("/app/")) {
//            System.out.println("server server~~~~~~~");
//            props.put("spring.profiles.active", "server");
//        } else {
//            System.out.println("local local~~~~~~~");
//            props.put("spring.profiles.active", "local");
//        }
//
//        app.setDefaultProperties(props);
//        app.run(args);
//    }
//
//    private static String getWarLocation() {
//        try {
//            CodeSource codeSource = Prjm09replyboardApplication.class.getProtectionDomain().getCodeSource();
//            if (codeSource != null) {
//                return codeSource.getLocation().getPath();
//            }
//        } catch (Exception e) {
//            // 로그로 출력해도 좋습니다.
//        }
//        return null;
//    }

}
