package com.questdot.retrofitexample;

/**
 * Created by HP on 24/9/2016.
 */


    import java.util.ArrayList;
    import java.util.List;

    public class DoorResponse {

        private Integer id;
        private String name;
        private Double price;
        private List<String> tags = new ArrayList<String>();

        /**
         * No args constructor for use in serialization
         *
         */
        public DoorResponse() {
        }

        /**
         *
         * @param tags
         * @param id
         * @param price
         * @param name
         */
        public DoorResponse(Integer id, String name, Double price, List<String> tags) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.tags = tags;
        }

        /**
         *
         * @return
         * The id
         */
        public Integer getId() {
            return id;
        }

        /**
         *
         * @param id
         * The id
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         *
         * @return
         * The price
         */
        public Double getPrice() {
            return price;
        }

        /**
         *
         * @param price
         * The price
         */
        public void setPrice(Double price) {
            this.price = price;
        }

        /**
         *
         * @return
         * The tags
         */
        public List<String> getTags() {
            return tags;
        }

        /**
         *
         * @param tags
         * The tags
         */
        public void setTags(List<String> tags) {
            this.tags = tags;
        }

    }

