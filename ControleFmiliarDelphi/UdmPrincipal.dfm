object dmPrincipal: TdmPrincipal
  OldCreateOrder = False
  Left = 303
  Top = 159
  Height = 150
  Width = 215
  object sqlConsSisComercial: TSQLConnection
    ConnectionName = 'contFamiliar'
    DriverName = 'Interbase'
    GetDriverFunc = 'getSQLDriverINTERBASE'
    LibraryName = 'dbexpint.dll'
    LoginPrompt = False
    Params.Strings = (
      'DriverName=Interbase'
      
        'Database=C:\Users\marcio e polliny\Documents\GitHub\repositorio\' +
        'ControleFmiliarDelphi\DADOS.FDB'
      'RoleName=RoleName'
      'User_Name=sysdba'
      'Password=masterkey'
      'ServerCharSet=WIN1252'
      'SQLDialect=3'
      'BlobSize=-1'
      'CommitRetain=False'
      'WaitOnLocks=True'
      'ErrorResourceFile='
      'LocaleCode=0000'
      'Interbase TransIsolation=ReadCommited'
      'Trim Char=False')
    VendorLib = 'gds32.dll'
    Connected = True
    Left = 80
    Top = 8
  end
end
