package hello.external;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class OsEnv {

    public static void main(String[] args) {
        Map<String, String> envMap = System.getenv();
        for (String key : envMap.keySet()) {
            log.info("env {}={}", key, System.getenv(key));
        }

        /*
         * 예시)
         * DB_URL=dev.db.com 개발서버
         * DB_URL=prod.db.com 운영서버
         */
        System.getenv("DB_URL");
    }
}
