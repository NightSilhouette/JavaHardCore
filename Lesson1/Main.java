package JK.Lesson1;

public class Main {
    public static void main(String[] args) {

        Competitor[] competitors = {new Turtle("Боб"), new Cat("Барсик"), new Wolf("Бобик")};
        Obstacle[] obstacles = {new Run(10), new Wall(10), new Water(50)};

        Team team = new Team("Живность", competitors);
        System.out.println("Формируем команду");
        System.out.println(team.getTeamName());

        System.out.println("Встречаем участников");
        team.showResults();

        Course course = new Course(obstacles);
        System.out.println("Команда на старте");
        course.doIt(team);

        System.out.println("Результаты");
        team.showResults();

    }
}