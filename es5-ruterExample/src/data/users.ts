export interface User{
    id: number;
    name: string;
    username: string;
    email: string;
    address: {
        street: string;
        city: string;
        zipcode: string;
    }
    website: string;
}

const users: User[] = [
    {
        id: 0,
        name: 'Mario Bianchi',
        username: 'MarioB',
        email: 'mb@gmail.com',
        address: {
            street: 'via Bertazza 2',
            city: 'Bologna',
            zipcode: '40122',
        },
        website: 'mariobianchi.photo',
    },
    {
        id: 1,
        name: 'Luigi Neri',
        username: 'LuigiN',
        email: 'ln@gmail.com',
        address: {
            street: 'via Tubotti 33',
            city: 'Milano',
            zipcode: '45666',
        },
        website: 'luigineri.photo',
    },
    {
        id: 2,
        name: 'Angela Birbante',
        username: 'AngelaB',
        email: 'ab@gmail.com',
        address: {
            street: 'via Arancino 1',
            city: 'Palermo',
            zipcode: '33628',
        },
        website: 'angelabirbante.photo',
    },
    {
        id: 3,
        name: 'Mario Gialli',
        username: 'MarioG',
        email: 'mg@gmail.com',
        address: {
            street: 'via Concreta 77',
            city: 'Modena',
            zipcode: '40052',
        },
        website: 'mariogialli.photo',
    }
]

export function fetchAllUser(): User[] {
    return users
}
export function fetchUserById(id: number): User | undefined {
    return users.find(user => user.id === id)
}