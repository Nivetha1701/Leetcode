import pandas as pd

def changeDatatype(students: pd.DataFrame) -> pd.DataFrame:
    
    df=students.astype({
        'grade':int
    })
    return df