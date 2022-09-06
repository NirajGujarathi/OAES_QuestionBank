package com.iiitb.oaes.Bean;

import org.hibernate.annotations.Check;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Check(constraints = "answer BETWEEN 1 AND 4")
public class MCQItem extends Item implements Serializable {
    @Column(nullable = false)
    private String option1;
    @Column(nullable = false)
    private String option2;
    @Column(nullable = false)
    private String option3;
    @Column(nullable = false)
    private String option4;

    @Column(nullable = false)
    private Integer answer;

    public MCQItem() { }

    public MCQItem(Integer itemId) { this.itemId = itemId; }

    public MCQItem(String question, String option1, String option2, String option3, String option4, Integer answer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "\nQuestion ID:" + itemId + '\n' +
                "Question: " + question + '\n' +
                "Option 1: " + option1 + '\n' +
                "Option 2: " + option2 + '\n' +
                "Option 3: " + option3 + '\n' +
                "Option 4: " + option4 + '\n' +
                "Correct Option: " + answer + '\n' +
                "Course: " + course.getName() + '\n';
    }
}


//@Entity
//@DiscriminatorValue("MCQ")
//@Check(constraints = "answer BETWEEN 1 AND 4")
//public class MCQItem extends Item implements Serializable {
//
//    @Column
//    private String option1;
//    @Column
//    private String option2;
//    @Column
//    private String option3;
//    @Column
//    private String option4;
//
//    @Column
//    private Integer answer;
//
//    public MCQItem() { }
//
//    public MCQItem(Integer itemId) { this.itemId = itemId; }
//
//    public MCQItem(String question, String option1, String option2, String option3, String option4, Integer answer) {
//        this.question = question;
//        this.option1 = option1;
//        this.option2 = option2;
//        this.option3 = option3;
//        this.option4 = option4;
//        this.answer = answer;
//    }
//
//    public String getOption1() {
//        return option1;
//    }
//
//    public void setOption1(String option1) {
//        this.option1 = option1;
//    }
//
//    public String getOption2() {
//        return option2;
//    }
//
//    public void setOption2(String option2) {
//        this.option2 = option2;
//    }
//
//    public String getOption3() {
//        return option3;
//    }
//
//    public void setOption3(String option3) {
//        this.option3 = option3;
//    }
//
//    public String getOption4() {
//        return option4;
//    }
//
//    public void setOption4(String option4) {
//        this.option4 = option4;
//    }
//
//    public Integer getAnswer() {
//        return answer;
//    }
//
//    public void setAnswer(Integer answer) {
//        this.answer = answer;
//    }
//
//    @Override
//    public String toString() {
//        return "\nQuestion ID:" + itemId + '\n' +
//                "Question: " + question + '\n' +
//                "Option 1: " + option1 + '\n' +
//                "Option 2: " + option2 + '\n' +
//                "Option 3: " + option3 + '\n' +
//                "Option 4: " + option4 + '\n' +
//                "Correct Option: " + answer + '\n' +
//                "Course: " + course.getName() + '\n';
//    }
//}
