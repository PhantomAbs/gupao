package com.gupao.decorator_observer.guava.gper;

/**
 * @author Spencer Zhang
 * @ClassName Question
 * @Description 问题对象
 * @Date 2019/04/01
 */
public class Question {

    private String questionerName;
    private String detail;
    private GPer gp;

    public Question(String questionerName, String detail, GPer gp) {
        this.questionerName = questionerName;
        this.detail = detail;
        this.gp = gp;
    }

    public String getQuestionerName() {
        return questionerName;
    }

    public String getDetail() {
        return detail;
    }

    public GPer getGp() {
        return gp;
    }

    @Override
    public String toString() {
        return "Question{" +
                "QuestionerName='" + questionerName + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
