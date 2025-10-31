export interface Aereo{
    id: number
    modello: string
    compagnia: string
    anno: number
    tipo: "Passeggieri" | "Cargo" | "Militare" | "Privato"
    capacitaPasseggeri: number
    autonomiaVolo: number
    statoRiparazione: boolean
    maxVelocita: number
    lastCheckYear: number
}

export const tipi = ["Passeggieri", "Cargo", "Militare", "Privato"]