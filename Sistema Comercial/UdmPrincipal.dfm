object dmPrincipal: TdmPrincipal
  OldCreateOrder = False
  Left = 192
  Top = 117
  Height = 150
  Width = 215
  object sqlConSisComercial: TSQLConnection
    ConnectionName = 'SisComercial'
    DriverName = 'Interbase'
    GetDriverFunc = 'getSQLDriverINTERBASE'
    LibraryName = 'dbexpint.dll'
    LoginPrompt = False
    Params.Strings = (
      'DriverName=Interbase'
      
        'Database=C:\Users\marcio e polliny\Documents\GitHub\repositorio\' +
        'Sistema Comercial\Dados\DADOS.FDB'
      'RoleName=RoleName'
      'User_Name=sysdba'
      'Password=masterkey'
      'ServerCharSet=win1252'
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
  end
end
