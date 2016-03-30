unit UdmCliente;

interface

uses
  SysUtils, Classes, FMTBcd, DB, SqlExpr, Provider, DBClient;

type
  TdmCliente = class(TDataModule)
    sdsCadCliente: TSQLDataSet;
    dspCadCliente: TDataSetProvider;
    cdsCadCliente: TClientDataSet;
    cdsCadClienteCLICODIGO: TIntegerField;
    cdsCadClienteCLINOME: TStringField;
    cdsCadClienteCLIENDERECO: TStringField;
    cdsCadClienteCLIBAIRRO: TStringField;
    cdsCadClienteCLIUF: TStringField;
    cdsCadClienteCLITEL1: TStringField;
    cdsCadClienteCLIETEL2: TStringField;
    cdsCadClienteCLICELULAR: TStringField;
    cdsCadClienteCLICEP: TStringField;
    cdsCadClienteDTCADASTRO: TSQLTimeStampField;
    cdsCadClienteDTATUALIZACAO: TSQLTimeStampField;
    cdsCadClienteCLICIDADE: TStringField;
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  dmCliente: TdmCliente;

implementation

uses UdmPrincipal;

{$R *.dfm}

end.
