package com.example.deepak.booklisting;

/**
 * Created by Deepak on 23-03-2017.
 */

public class BookList {

        private String id;
        private String link;
        private String image;
        private String title;
        private String author;
        private String description;

        public  BookList(String id,String link,String image,String title,String author,String description){
            this.id = id;
            this.link = link;
            this.image = image;
            this.title = title;
            this.author = author;
            this.description = description;
        }

        public String getId(){

            return id;
        }

        public void setId(String bookid)
        {
            this.id = id;
        }

        public String getLink(){

            return link;
        }

        public void setLink(){
            this.link = link;
        }

        public String getImage(){

            return image;
        }

        public void setImage(){

            this.image = image;
        }
        public String getTitle()
        {
            return title;
        }

        public void setTitle(){
            this.title = title;
        }

        public String getAuthor(){

            return author;
        }

        public void  setAuthor(){

            this.author= author;
        }


        public String getDescription()
        {
            return description;
        }

        public void setDescription(){

            this.description = description;
        }
    }


