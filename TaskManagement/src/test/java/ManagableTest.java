import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


class ManagableTest {


    private Managable managable;
    private Managable managable2;

    @BeforeEach
    void setup(){
        managable = new Project("Code testen", "de code dient getest te worden om zeker te weten of het werkt", LocalDate.of(2024, 02, 10));
        managable2 = new Project("Huiswerk", "Huiswerk van java maken over interfaces enzo", LocalDate.now().minusDays(2));
    }

    @Test
    void isNotOverdue() {
        Assertions.assertFalse(Managable.isOverdue(managable));
    }

    @Test
    void isOverdue(){
        Assertions.assertTrue(Managable.isOverdue(managable2));
    }
}