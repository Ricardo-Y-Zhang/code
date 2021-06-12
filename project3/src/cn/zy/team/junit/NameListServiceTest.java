package src.cn.zy.team.junit;

import org.junit.Test;
import src.cn.zy.team.domain.Employee;
import src.cn.zy.team.service.NameListService;
import src.cn.zy.team.service.TeamException;

public class NameListServiceTest {

     @Test
    public void testGetAllEmployees(){

         NameListService service = new NameListService();

         Employee[] employees = service.getAllEmployees();

         for(int i = 0; i < employees.length; i++){
             System.out.println(employees[i]);
         }
     }

     @Test
    public void testGetEmployee(){

         NameListService service = new NameListService();

         int id = 14;


         //异常处理
         try {
             Employee employee = service.getEmployee(id);
             System.out.println(employee);
         } catch (TeamException e) {
             System.out.println(e.getMessage());
         }
     }
}
