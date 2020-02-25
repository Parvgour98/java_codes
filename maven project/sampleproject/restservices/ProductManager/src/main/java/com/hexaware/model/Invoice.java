package com.hexaware.model;

import java.util.Date;

class Invoice{
        private int Inv_Id;
        private Date inv_date;
        private Date due_date;
        private int Quantity;
        private double Total_Amount;

        //default constructor
        public Invoice(){}

        //parameterized constructor
        public Invoice(int inv_id, Date inv_date, Date due_date, int Qty, double total){
                this.Inv_Id = inv_id;
                this.inv_date = inv_date;
                this.due_date = due_date;
                Quantity = Qty;
                Total_Amount = total;
        }

        //getters
        public int getInvId(){
                return Inv_Id; 
        }
        public Date getInvDate(){
                return inv_date;
        }
        public Date getDueDate(){
                return due_date;
        }
        public int getQuantity(){
                return Quantity;
        }
        public double getTotalAmount(){
                return Total_amount;
        }

        //setters
        public void setInvId(int id){
                this.Inv_Id = id;
        }
        public void setInvDate(Date d){
                this.inv_date = d;
        }
        public void setDueDate(Date d){
                this.due_date = d;
        }
        public void setQuantity(int qty){
                this.Quantity = qty;
        }
        public void setTotalAmount(double ta){
                this.Total_Amount = ta;
        }

        @Override
        public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + Inv_Id;
                result = prime * result + Quantity;
                long temp;
                temp = Double.doubleToLongBits(Total_Amount);
                result = prime * result + (int) (temp ^ (temp >>> 32));
                result = prime * result + ((due_date == null) ? 0 : due_date.hashCode());
                result = prime * result + ((inv_date == null) ? 0 : inv_date.hashCode());
                return result;
        }

        @Override
        public boolean equals(Object obj) {
                if (this == obj)
                        return true;
                if (obj == null)
                        return false;
                if (getClass() != obj.getClass())
                        return false;
                Invoice other = (Invoice) obj;
                if (Inv_Id != other.Inv_Id)
                        return false;
                if (Quantity != other.Quantity)
                        return false;
                if (Double.doubleToLongBits(Total_Amount) != Double.doubleToLongBits(other.Total_Amount))
                        return false;
                if (due_date == null) {
                        if (other.due_date != null)
                                return false;
                } else if (!due_date.equals(other.due_date))
                        return false;
                if (inv_date == null) {
                        if (other.inv_date != null)
                                return false;
                } else if (!inv_date.equals(other.inv_date))
                        return false;
                return true;
        }
        //toString
        @Override
        public String toString() {
                return "Invoice Id: " + Inv_Id + " Invoice Date: " + inv_date +
                 " Due Date: " + due_date + " Quantity: " + Quantity + " Total Amount: " + Total_Amount;
        }
}