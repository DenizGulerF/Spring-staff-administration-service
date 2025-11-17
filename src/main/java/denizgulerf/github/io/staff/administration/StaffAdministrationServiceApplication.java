package denizgulerf.github.io.staff.administration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class StaffAdministrationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StaffAdministrationServiceApplication.class, args);
    }

}
