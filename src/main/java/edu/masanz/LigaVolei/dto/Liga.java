package edu.masanz.LigaVolei.dto;


    public  class Liga {

        private int ligaid;
        private String nombre;
        private String descripcion;




        public Liga(int id, String nombre) {
            this.ligaid = id;
            this.nombre = nombre;

        }


        public int getId() {
            return ligaid;
        }

        public void setId(int id) {
            this.ligaid = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

    }

