package ie.atu.payrollsystem;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/payroll")

public class PayrollController {

    List<Payroll> myList = new ArrayList<>();

    @GetMapping("/login")
    public String Login() {
        return "login";
    }

    @GetMapping("/getPayroll")
    public List<Payroll> getProduct() {
       Payroll myPayroll = new Payroll("Name", 68000);
        return myList;
    }

    @PostMapping("/addPayroll")
    public Payroll addPayroll(@Valid @RequestBody Payroll myPayroll) {
        myList.add(myPayroll);
        return myPayroll;
    }

}
