package ar.com.ada.api.clima.entities;
import javax.persistence.*;

@Entity
@Table(name = "temperatura")
public class Temperatura {
    @Column(name = "temperatura_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer temperaturaId;
    @Column(name = "anio_temperatura")
    private Integer anioTemperatura;
    private Double grados;
    @JoinColumn(name = "codigo_pais", referencedColumnName = "codigo_pais")
    @ManyToOne
    private Pais pais;

    public Integer getTemperaturaId() {
        return temperaturaId;
    }

    public void setTemperaturaId(Integer temperaturaId) {
        this.temperaturaId = temperaturaId;
    }

    public Integer getAnioTemperatura() {
        return anioTemperatura;
    }

    public void setAnioTemperatura(Integer anioTemperatura) {
        this.anioTemperatura = anioTemperatura;
    }

    public Double getGrados() {
        return grados;
    }

    public void setGrados(Double grados) {
        this.grados = grados;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
        this.pais.getTemperaturas().add(this);
    }

}