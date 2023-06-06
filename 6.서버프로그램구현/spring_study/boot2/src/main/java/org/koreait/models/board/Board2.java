package org.koreait.models.board;

public class Board2 {
    private Long id;
    private String subject;
    private String content;
    private Board2() {}

    @Override
    public String toString() {
        return "Board2{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public static Builder builder(){
        return new Builder();
    }



    public class Builder{ //내부 객체 만들기
        private Board2 instance = new Board2();
        public Builder id(Long id){
            instance.id = id;

            return this;
        }

        public Builder subject(String subject){
            instance.subject = subject;
            return this;
        }

        public Builder content(String content){
            instance.content=content;
            return this;
        }

        public Board2 build(){
            return instance;
        }
    }
}
