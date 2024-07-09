public class Main {
    public static void main(String[] args) {
        var dog=8.0;
        System.out.println(dog);
        var cat=3.6;
        System.out.println(cat);
        var paper=763789;
        System.out.println(paper);

        dog=dog + 4;
        System.out.println(dog);
        cat=cat+4;
        System.out.println(cat);
        paper=paper+4;
        System.out.println(paper);
        dog=dog-3.5;
        System.out.println(dog);
        cat=cat-1.6;
        System.out.println(cat);
        paper=paper-7639;
        System.out.println(paper);

        var friend=19;
        System.out.println(friend);
        friend=(friend+2)/7;
        System.out.println(friend);

        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);

        var oneBoxer=78.2;
        System.out.println(oneBoxer);
        var twoBoxer=82.7;
        System.out.println(twoBoxer);
        var totalWeight=oneBoxer+twoBoxer;
        System.out.println(totalWeight);
        var differenceWeight=twoBoxer-oneBoxer;
        System.out.println(differenceWeight);
        var remainsWeight=twoBoxer%oneBoxer;
        System.out.println(remainsWeight);

        var workingHours=640;
        System.out.println(workingHours);
        var employeesTime=8;
        System.out.println(employeesTime);
        var numberWorkers=workingHours/employeesTime;
        System.out.println("Всего работников в компании — " +numberWorkers+ " человек.");
        numberWorkers=numberWorkers+94;
        employeesTime=workingHours/numberWorkers;
        System.out.println("Если в компании работаетe " +  numberWorkers+" человек, то всего " + employeesTime + " часов работы может быть поделено между сотрудниками.");



    }
}