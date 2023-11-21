package jp.ac.chitose.db_prac;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PreExam {

    private String gakusekiCode;
    private String familyName;
    private String fristName;
    private int point;

    public PreExam(String gakusekiCode, String familyName, String firstName, int point) {
        this.gakusekiCode = gakusekiCode;
        this.familyName = familyName;
        this.fristName = firstName;
        this.point = point;
    }

    public void print(){
        System.out.println(gakusekiCode+"さんは"+point+"点");
    }
}
