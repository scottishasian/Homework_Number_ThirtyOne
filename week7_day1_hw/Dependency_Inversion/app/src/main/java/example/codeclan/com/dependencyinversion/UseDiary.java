package example.codeclan.com.dependencyinversion;

/**
 * Created by kynansong on 06/11/2017.
 */

public class UseDiary {

    private Diary journal;
    private Bear bear;

    public UseDiary(){
        this.bear = new Bear();
        this.journal = new Diary();
    }


    public Diary getJournal(){
        return this.journal;
    }

    public void writeJournal(String text){
        this.journal.write(text);
    }

}
