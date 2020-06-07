package ourpuzzle.com.puzzle;

public class checkLogIn {
    public int sign=0;

    public void changeSignIn(){
        sign=1;

    }
    public boolean checkSignIn(){

        if(sign==0)
            return false;
        else
            return true;
    }
}
