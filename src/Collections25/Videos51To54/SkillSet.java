package Collections25.Videos51To54;

import java.util.HashSet;

public class SkillSet <E> extends HashSet<String> {
    public Boolean isComplete() {
        return this.contains("programming") && this.contains("deutsch");
    }
}
