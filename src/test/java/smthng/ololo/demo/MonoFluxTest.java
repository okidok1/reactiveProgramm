package smthng.ololo.demo;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxTest {

    @Test
    public void testMono(){
        Mono<String> monoString = Mono.just("TestingReactiveProgram").log();
        monoString.subscribe(System.out::println);

    }
    @Test
    public void testFlux(){
        Flux<String> fluxString = Flux.just("FirstOne", "SecondOne", "ThirdOne", "FourthOne").log();
        fluxString.subscribe(System.out::println);

    }
}
