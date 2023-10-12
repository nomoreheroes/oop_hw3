/**
 * TODO: Реализовать тип фрилансера в рамках домашней работы
 * Фрилансер (работник с почасовой оплатой)
 */
public class Freelancer extends Employee  {

    public String specialization;
    public int rating;
    public double hourly_rate;

    public Freelancer(String surName, String name, String specialization, int rating, double hourly_rate)
    {
        super(surName, name, 0.0);
        this.specialization = specialization;
        this.hourly_rate = hourly_rate;
        this.rating = rating;
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * this.hourly_rate;
    }


    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер (%s); Стоимость часа: %.2f (руб.), текущий рейтинг: %d",
                surName, name, specialization, hourly_rate,rating);
    }

    @Override
    public int compareTo(Employee o) {
        return ((Integer) this.rating).compareTo(((Freelancer)o).rating);
    } 
}


