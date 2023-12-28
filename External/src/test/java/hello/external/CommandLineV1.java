package hello.external;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommandLineV1 {

    public static void main(String[] args) {
        //빌드된 파일을 실행할 경우 명령어 : java -jar External-0.0.1-SNAPSHOT.jar arg1 arg2 ...
        for (String arg : args) {
            log.info("arg = {}", arg);
        }
    }
}
