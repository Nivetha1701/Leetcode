import pandas as pd

def dropMissingData(students: pd.DataFrame) -> pd.DataFrame:
    
    df_cleaned=students.dropna(subset='name')
    return df_cleaned