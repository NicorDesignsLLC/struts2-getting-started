/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nicordesigns.crud.model;

import java.io.Serializable;

public class Province implements Serializable {
    
	private static final long serialVersionUID = 1L;
    private Integer provinceid;
    private String provincename;
    private String provinceTaxrate;
    
    public Province() {
    }

    public Province(Integer provinceid, String provincename, String provinceTaxrate) {
		super();
		this.provinceid = provinceid;
		this.provincename = provincename;
		this.provinceTaxrate = provinceTaxrate;
	}

	public Province(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    public String getProvinceTaxrate() {
        return provinceTaxrate;
    }

    public void setProvinceTaxrate(String provinceTaxrate) {
        this.provinceTaxrate = provinceTaxrate;
    }

        @Override
    public int hashCode() {
        int hash = 0;
        hash += (provinceid != null ? provinceid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Province)) {
            return false;
        }
        Province other = (Province) object;
        if ((this.provinceid == null && other.provinceid != null) || (this.provinceid != null && !this.provinceid.equals(other.provinceid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Province[ provinceid=" + provinceid + " ]";
    }
    
}
