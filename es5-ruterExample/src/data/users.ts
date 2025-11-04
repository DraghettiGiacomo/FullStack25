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