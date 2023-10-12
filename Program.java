import java.util.Random;
import java.util.LinkedList;
import java.util.Collections;

public class Program {

    public static void main(String[] args) {
        LinkedList<Worker> ws = new LinkedList<Worker>();
        LinkedList<Freelancer> fs = new LinkedList<Freelancer>();
        int counter = 0;
        int limit = 50+new Random().nextInt(100);
        while(counter <  limit)
        {
            Employee x = generateEmployees();
            if (x instanceof Freelancer) fs.add((Freelancer)x);
            else ws.add((Worker)x);
            counter++;
        }
        Collections.sort(ws);
        Collections.sort(fs);
        System.out.println("Рабочие:");
        for(int i=0;i<ws.size();i++) System.out.printf("\t%d)%s\n",i,ws.get(i));
        System.out.println("Фрилансеры:");
        for(int i=0;i<fs.size();i++) System.out.printf("\t%d)%s\n",i,fs.get(i));
    }

    public static Employee generateEmployees()
    {
        boolean isFreelancer = new Random().nextBoolean();
        String[] names = new String[]{"Иван","Петр","Сидор","Клим","Виктор","Торвлобнор","Константин","Денис","Андрей"};
        String[] surnames = new String[] {"Иванов","Петров","Сидоров","Климов", "Викторов", "Эскобар", "Константинов","Денисов","Андреев"};
        String name = names[new Random().nextInt(names.length)];
        String surname = surnames[new Random().nextInt(surnames.length)];
        Double salary = new Random().nextInt(1000)+new Random().nextDouble();
        Double hourly_rate = new Random().nextInt(100)+new Random().nextDouble();
        String[] specs = new String[]{"Дизайнер","Программист","Аналитик данных","Бездельник"};
        String spec = specs[new Random().nextInt(specs.length)];
        int rating = new Random().nextInt(11);
        if (isFreelancer) return new Freelancer(surname, name, spec, rating, hourly_rate);
        else return new Worker(surname,name,salary);
    }

}
