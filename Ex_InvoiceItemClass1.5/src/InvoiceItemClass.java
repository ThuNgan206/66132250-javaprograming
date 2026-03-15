public class InvoiceItemClass {
     private String id;
     private String desc;
     private int qty;
     private double unitPrice;
     public InvoiceItemClass(String id, String desc, int qty, double unitPrice) {
    	 this.id = id;
    	 this.desc = desc;
    	 this.qty = qty;
    	 this.unitPrice = unitPrice;
     }
     //getter
     public String getId() {
    	 return id;
     }
     public String getDesc() {
    	 return desc;
     }
     public int getQty() {
    	 return qty;
     }
     public double getUnitPrice() {
    	 return unitPrice;
     }
     public double getTotal() {
    	 return unitPrice * qty;
     }
     //setter
     public void setQty(int qty) {
    	 this.qty = qty;
     }
     public void setUnitPrice(double unitPrice) {
    	 this.unitPrice = unitPrice;
     }
     //toString
     public String toString() {
    	 return "InvoiceItem[id = " + id + ",desc = " + desc + ",qty = " + qty + ",unitPrice = " + unitPrice + "]"; 
     }
}
