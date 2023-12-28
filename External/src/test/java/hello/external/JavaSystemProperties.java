package hello.external;

import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

@Slf4j
public class JavaSystemProperties {

    public static void main(String[] args) {
        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
            log.info("prop {}={}", key, System.getProperty(String.valueOf(key)));
        }

        //빌드된 파일을 실행할 경우 명령어 : java -Durl=devdb -Dusername=dev_user -Dpassword=dev_pw -jar External-0.0.1-SNAPSHOT.jar (순서 중요!)
        String url = System.getProperty("url");
        String username = System.getProperty("username");
        String password = System.getProperty("password");

        log.info("url={}", url);
        log.info("username={}", username);
        log.info("password={}", password);

        //자바코드로 JVM 옵션을 설정할 경우
        System.setProperty("exam_key", "exam_value");
        String examValue = System.getProperty("exam_key");
        log.info("exam_key={}", examValue);
    }
}
