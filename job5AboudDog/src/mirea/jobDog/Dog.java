package mirea.jobDog;

public class Dog {
    private String nickname;
    private int ageDog;

    public Dog(String nickname, int age){
        this.nickname = nickname;
        this.ageDog = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAgeDog() {
        return ageDog;
    }

    public void setAgeDog(int ageDog) {
        this.ageDog = ageDog;
    }

    public int getAgeDogInHuman(){
        return ageDog * 7;
    }

    @Override
    public String toString(){
        return "Dog{ nickname = " + nickname + ", age = " + ageDog + " }";
    }
}
