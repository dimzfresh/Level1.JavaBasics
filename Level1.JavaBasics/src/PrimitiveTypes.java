public class PrimitiveTypes {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Kirill", 37, true, 0);
        Friend friend2 = new Friend("Pasha", 29, false, 3);
        Friend friend3 = new Friend("Sasha", 37, false, 7);
        Friend[] friends = { friend1, friend2, friend3 };

        for (Friend friend : friends) {
            System.out.println(friend.toString());
        };
    }
}

final class Friend {
    private String name;
    private int age;
    private boolean isFriendFromSchool;
    private float hoursSpentTogetherLastWeek;

    Friend(String name, int age, boolean isFriendFromSchool, float hoursSpentTogetherLastWeek) {
        this.name = name;
        this.age = age;
        this.isFriendFromSchool = isFriendFromSchool;
        this.hoursSpentTogetherLastWeek = hoursSpentTogetherLastWeek;
    }

    @Override
    public String toString() {
        return "Friend{" + ", \n" +
                "name: " + name + ", \n" +
                "age: " + age + ", \n" +
                "isFriendFromSchool: " + isFriendFromSchool + ", \n" +
                "hoursSpentTogetherLastWeek: " + hoursSpentTogetherLastWeek + ", \n" +
                "}";
    }
}