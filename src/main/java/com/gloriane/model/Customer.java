package com.gloriane.model;

    public class Customer {
        private int id;
        private String name;
        private String email;
        private String phone;
        private CustomerType type;

        // ===== CONSTRUCTOR =====
        // Constructor for creating a NEW customer (without an ID yet).We use this when registering a brand-new customer
        // Note: id is not set here because the database will give us one
        public Customer(String name, String email, String phone, CustomerType type) {
            this.name = name;
            this.email = email;
            this.phone = phone;
            this.type = type;
        }

        // Constructor for creating a customer that ALREADY EXISTS in database.We use this when loading customers from the database
        public Customer(int id, String name, String email, String phone, CustomerType type) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.phone = phone;
            this.type = type;
        }

        // ===== GETTERS AND SETTERS =====
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public CustomerType getType() {
            return type;
        }

        public void setType(CustomerType type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("Customer[id=%d, name=%s, email=%s, phone=%s, type=%s]",
                    id, name, email, phone, type);
        }

        // equals() checks if two customers are the same. Two customers are the same if they have the same ID
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Customer customer = (Customer) obj;
            return id == customer.id;
        }

        // hashCode() creates a unique number for this customer. This is used when storing customers in certain types of collections
        @Override
        public int hashCode() {
            return Integer.hashCode(id);
        }
    }

