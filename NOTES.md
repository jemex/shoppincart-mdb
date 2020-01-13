# Notes

## Tasks

- Add 'Total' line to receipt - Sum of all items

- Make receipt print items in order they were scanned

- Improve test coverage

- Make tests more modular for less forced updating

- Some branches, customers wants price first on receipt line

- Any other improvements

### Total Price

- Make total price function that takes items Queue as input
- Returns integer as total price
- Use in printReceipt function

### Print items in scanned order

- Rewrite HashMap to a Queue Data Structure with Item Object as DataType
- Rewrite addItem and printReceipt
- Print by taking item one by one out of Queue

### Improve test coverage

- Add additional test cases for new implementation and features

### Print receipt at front

- Make Item class and ReceiptFormat class, Item class takes ReceiptFormat class in constructor and Itemtype and also Itemnumber
- For each property we will have getters and setters which opens the opportunity to edit the Item
- We will have a printItem function in which the format determines the output, also forces to rewrite the printReceipt function to replace the sysout statement
- Format is property in Shoppingcart -> Constructor
- This indicates that the format has to be determined before the receipt is printed. (Maybe create format when creating new item ? Discussion)
- Function addItem will be rewritten to Instantiation of Item, by passing the properties and adding to our Queue

### Improvements

- Since we have Item class we can add edit and delete functionality for items
- Add receipt history and store in mongodb
- Make history class with get function to print all receipts by requesting our mongodb database
- Receipt History can be largely extended with many features