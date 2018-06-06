## Final
  - used to create constants , eg: final int a=10; ( the value of a cant be chaged in the program )
  - final classes cant be inherited
  - final methods cannot be overriden
## Finally
  - used with Exception handling
  - will execute even if there is a exception or not
  - Eg:   try{ <br />
            ====== <br />
        }catch(Exception e) <br />
        { <br />
          ======== <br />
        } <br />
        finally{ <br />
        // this will defitely be executed eve if there is exception or not.. <br />
        } <br />
  
  ## Finalize
    - works like a destructor
    - just before the garbage collector is invoked the finalize method will work..

## String , stringbuffer and stringbuilder
    - string is immutable
    - buffer and builder are mutable
    - can append to the same string using string buffer and builder , but using string it will
      return a new string. 
    - buffer operations are thread safe
    - used when multiple thread work on same string
    - low performance because syncronization is involved
