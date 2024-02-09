<html>
<body>
<h2>Hello World!</h2>
<form method="post" action="inv">  
       <div class="container">  
       	   <label>Investor ID : </label>   
           <input type="text"  name="investor-id" required>   
           <label>Investor name : </label>   
           <input type="text"  name="investor-name" required>  
           <label>Amount : </label>   
           <input type="text"  name="investor-amount" required>  
           <button type="submit">Add Investor</button>   
       </div>   
    </form>
    
	<form method="post" action="trans">  
       <div class="container">   
           <label>Transaction ID :</label>   
           <input type="text"  name="transaction-id" required>  
           <label>Transaction date : </label>   
           <input type="text"  name="transaction-date" required>  
           <label>Transaction amount : </label>   
           <input type="text"  name="transaction-amount" required>  
           <label>Investor ID : </label>   
           <input type="text"  name="trans-investor-id" required>   
           <button type="submit">Add Transaction</button>   
       </div>   
    </form>
    
    <form method="get" action="inv">
           <label>Investor ID : </label>   
           <input type="text"  name="investor-id" required>   
           <button type="submit">Show Investor</button> 
    </form>
</body>
</html>
