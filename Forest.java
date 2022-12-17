import java.util.List;

public class Forest {
    private List<MountainHare> hares;
    private static String season;

    public Forest(List<MountainHare> hares) {
        this.hares = hares;
    }


    // объявите недостающие переменные и добавьте конструктор

    public static void setSeason(String newSeason){
        if (newSeason.equals("зима")){
            season = newSeason;
            MountainHare.color = "белый";
        } else {
            season = newSeason;
            MountainHare.color = "серо-рыжий";
        }
    }
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков

    public void printHares(){
        for (MountainHare hare : hares){
            System.out.println(hare);
        }
    }


}
