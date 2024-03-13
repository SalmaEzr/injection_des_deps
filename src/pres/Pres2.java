package pres;




import dao.IDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pres2 {

    public static void main(String []args) throws FileNotFoundException{
        Scanner scanner =new Scanner(new File( pathname:"config.txt" ));
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao =(IDao) cDao.newInstance();

    }
}
