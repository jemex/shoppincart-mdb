# Notes

## Tasks

- Add 'Total' line to receipt - Sum of all items

- Make receipt print items in order they were scanned

- Improve test coverage

- Make tests more modular for less forced updating

- Some branches, customers wants price first on receipt line

- Any other improvements

### Total Price

- getTotal function in our IReceiptFormat Interface
- Returns integer as total price
- Use in getReceipt function

### Print items in scanned order

- 
- Rewrite addItem and printReceipt
- Print by taking item one by one out of Queue

### Improve test coverage

- Add additional test cases for new implementation and features

### Print receipt at front

- Create IReceipFormat Interface and create one RegularReceiptFormat class and one PrintFrontFormat class
- Both will implement IReceiptFormat which will have a getReceipt function
- Our getReceipt function will have their respected implementation of how we want our receipt to be formatted

### Improvements

- Since we have ItemStore interface we can add edit and delete functionality for items
- Add IReceiptStore interface with ReceiptStore and connect to a mongo database
- Make receiptstore with get and add function by requesting the db