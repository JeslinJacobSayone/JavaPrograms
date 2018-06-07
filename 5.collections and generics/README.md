## Collections and Generics

  ArrayList --------------------> List------------------>Collections <br />
  --------------(implements)---------------(extends)-------------------------
                  
we can use collections when we dont know the exact size of the array.
in collection we can store any type of data.If we need only specific type of data then we have to use the generics.

arrays are faster
we cant delete members in between the collection , so we have something called List .

##### Problems with collection Interface

- we cannot add values in between , since it does not have indexes.
- we cannot sort the value
- slower tha ussual array.

## Map Interface

- we can use key value pairs and store elements in an array fashion.
- we can mention generic type if we want to store any particular type of elements.

Map generics map = new HashMap(); ( here HashMap is a class which implements map interface , we also have HashTable)

- Hashmap does not print map elements in any order , **LinkedHashMap** can be used for setting elements in order
and **TreeHashMap** can be used to elements in a sorted format.

|**HashMap**                 |   **HashTable**            | 
|----------------------------|:--------------------------:|
|- not syncronized           | - syncronized              |
|- faster                    | - slower                   | 
|- allows one null key       | - does not allow null key  | 

