import pandas as pd

def selectFirstRows(employees: pd.DataFrame) -> pd.DataFrame:
    
    df=pd.DataFrame(employees,columns=['employee_id','name','department','salary']);
    total=df.head(3)
    return total