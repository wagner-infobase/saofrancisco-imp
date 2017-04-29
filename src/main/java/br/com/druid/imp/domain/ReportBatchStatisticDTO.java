package br.com.druid.imp.domain;

import java.math.BigDecimal;

public class ReportBatchStatisticDTO {

private String dscMovimentacao;
private BigDecimal pendenteEnvio;
private BigDecimal preValidadaOk;
private BigDecimal preValidadaErro;
private BigDecimal ok;

public ReportBatchStatisticDTO() {}

public ReportBatchStatisticDTO(String dscMovimentacao, BigDecimal pendenteEnvio, BigDecimal preValidadaOk,
BigDecimal preValidadaErro, BigDecimal ok) {
super();
this.dscMovimentacao = dscMovimentacao;
this.pendenteEnvio = pendenteEnvio;
this.preValidadaOk = preValidadaOk;
this.preValidadaErro = preValidadaErro;
this.ok = ok;
}

public String getDscMovimentacao() {
return dscMovimentacao;
}

public void setDscMovimentacao(String dscMovimentacao) {
this.dscMovimentacao = dscMovimentacao;
}

public BigDecimal getPendenteEnvio() {
return pendenteEnvio;
}

public void setPendenteEnvio(BigDecimal pendenteEnvio) {
this.pendenteEnvio = pendenteEnvio;
}

public BigDecimal getPreValidadaOk() {
return preValidadaOk;
}

public void setPreValidadaOk(BigDecimal preValidadaOk) {
this.preValidadaOk = preValidadaOk;
}

public BigDecimal getPreValidadaErro() {
return preValidadaErro;
}

public void setPreValidadaErro(BigDecimal preValidadaErro) {
this.preValidadaErro = preValidadaErro;
}

public BigDecimal getOk() {
return ok;
}

public void setOk(BigDecimal ok) {
this.ok = ok;
}
}