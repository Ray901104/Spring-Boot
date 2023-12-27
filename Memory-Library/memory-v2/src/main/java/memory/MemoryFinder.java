package memory;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MemoryFinder {

    public Memory get() {
        long maxMemory = Runtime.getRuntime().maxMemory(); //JVM이 사용할 수 있는 최대 메모리
        long totalMemory = Runtime.getRuntime().totalMemory(); //JVM이 확보한 전체 메모리
        long freeMemory = Runtime.getRuntime().freeMemory(); //total 중에 사용하지 않은 메모리

        long usedMemory = totalMemory - freeMemory; //JVM이 사용중인 메모리
        return new Memory(usedMemory, maxMemory);
    }

    @PostConstruct
    public void init() {
        log.info("init memoryFinder");
    }
}
